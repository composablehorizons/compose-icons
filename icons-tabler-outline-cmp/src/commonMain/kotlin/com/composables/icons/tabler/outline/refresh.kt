package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Refresh: ImageVector
    get() {
        if (_Refresh != null) return _Refresh!!
        
        _Refresh = ImageVector.Builder(
            name = "refresh",
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
                moveTo(20f, 11f)
                arcToRelative(8.1f, 8.1f, 0f, false, false, -15.5f, -2f)
                moveToRelative(-0.5f, -4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                arcToRelative(8.1f, 8.1f, 0f, false, false, 15.5f, 2f)
                moveToRelative(0.5f, 4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
            }
        }.build()
        
        return _Refresh!!
    }

private var _Refresh: ImageVector? = null

