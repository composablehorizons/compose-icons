package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UsersRound: ImageVector
    get() {
        if (_UsersRound != null) return _UsersRound!!
        
        _UsersRound = ImageVector.Builder(
            name = "users-round",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 21f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 8f)
                arcTo(5f, 5f, 0f, false, true, 10f, 13f)
                arcTo(5f, 5f, 0f, false, true, 5f, 8f)
                arcTo(5f, 5f, 0f, false, true, 15f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                curveToRelative(0f, -3.37f, -2f, -6.5f, -4f, -8f)
                arcToRelative(5f, 5f, 0f, false, false, -0.45f, -8.3f)
            }
        }.build()
        
        return _UsersRound!!
    }

private var _UsersRound: ImageVector? = null

