package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Multiline_chart: ImageVector
    get() {
        if (_Multiline_chart != null) return _Multiline_chart!!
        
        _Multiline_chart = ImageVector.Builder(
            name = "multiline_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 6.92f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.85f, 3.21f)
                curveTo(15.68f, 6.4f, 12.83f, 5f, 9.61f, 5f)
                curveTo(6.72f, 5f, 4.07f, 6.16f, 2f, 8f)
                lineToRelative(1.42f, 1.42f)
                curveTo(5.12f, 7.93f, 7.27f, 7f, 9.61f, 7f)
                curveToRelative(2.74f, 0f, 5.09f, 1.26f, 6.77f, 3.24f)
                lineToRelative(-2.88f, 3.24f)
                lineToRelative(-4f, -4f)
                lineTo(2f, 16.99f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(6f, -6.01f)
                lineToRelative(4f, 4f)
                lineToRelative(4.05f, -4.55f)
                curveToRelative(0.75f, 1.35f, 1.25f, 2.9f, 1.44f, 4.55f)
                horizontalLineTo(21f)
                curveToRelative(-0.22f, -2.3f, -0.95f, -4.39f, -2.04f, -6.14f)
                lineTo(22f, 6.92f)
                close()
            }
        }.build()
        
        return _Multiline_chart!!
    }

private var _Multiline_chart: ImageVector? = null

