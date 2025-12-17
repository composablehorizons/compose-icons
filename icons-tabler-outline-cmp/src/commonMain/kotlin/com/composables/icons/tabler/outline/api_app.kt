package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ApiApp: ImageVector
    get() {
        if (_ApiApp != null) return _ApiApp!!
        
        _ApiApp = ImageVector.Builder(
            name = "api-app",
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
                moveTo(12f, 15f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -5f)
                horizontalLineToRelative(0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                verticalLineToRelative(-0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                horizontalLineToRelative(6.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, 5f)
                horizontalLineToRelative(-0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                verticalLineToRelative(-6.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineToRelative(0.5f)
            }
        }.build()
        
        return _ApiApp!!
    }

private var _ApiApp: ImageVector? = null

