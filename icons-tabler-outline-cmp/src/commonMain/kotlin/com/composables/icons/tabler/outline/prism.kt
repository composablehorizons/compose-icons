package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Prism: ImageVector
    get() {
        if (_Prism != null) return _Prism!!
        
        _Prism = ImageVector.Builder(
            name = "prism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                verticalLineToRelative(13f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 17.17f)
                lineToRelative(-5.98f, 4.485f)
                arcToRelative(1.7f, 1.7f, 0f, false, true, -2.04f, 0f)
                lineToRelative(-5.98f, -4.485f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1f, -2f)
                verticalLineToRelative(-11.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(11.17f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.3f, 3.3f)
                lineToRelative(6.655f, 5.186f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, 2.09f, 0f)
                lineToRelative(6.655f, -5.186f)
            }
        }.build()
        
        return _Prism!!
    }

private var _Prism: ImageVector? = null

