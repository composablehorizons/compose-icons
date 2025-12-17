package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Multiline_chart: ImageVector
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.36f, 6.28f)
                lineToRelative(-0.06f, -0.06f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.37f, -1.39f, 0.04f)
                lineToRelative(-2.18f, 2.45f)
                curveTo(15.68f, 6.4f, 12.83f, 5f, 9.61f, 5f)
                curveToRelative(-2.5f, 0f, -4.83f, 0.87f, -6.75f, 2.3f)
                curveToRelative(-0.47f, 0.35f, -0.52f, 1.04f, -0.11f, 1.45f)
                lineToRelative(0.06f, 0.06f)
                curveToRelative(0.33f, 0.33f, 0.86f, 0.39f, 1.23f, 0.11f)
                curveTo(5.63f, 7.72f, 7.54f, 7f, 9.61f, 7f)
                curveToRelative(2.74f, 0f, 5.09f, 1.26f, 6.77f, 3.24f)
                lineToRelative(-2.88f, 3.24f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-6.12f, 6.13f)
                curveToRelative(-0.37f, 0.37f, -0.37f, 0.98f, 0f, 1.35f)
                lineToRelative(0.15f, 0.15f)
                curveToRelative(0.37f, 0.37f, 0.98f, 0.37f, 1.35f, 0f)
                lineToRelative(5.32f, -5.33f)
                lineToRelative(3.25f, 3.25f)
                curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f)
                lineToRelative(3.35f, -3.76f)
                curveToRelative(0.62f, 1.12f, 1.08f, 2.39f, 1.32f, 3.73f)
                curveToRelative(0.08f, 0.47f, 0.47f, 0.82f, 0.95f, 0.82f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.6f, 0f, 1.05f, -0.55f, 0.94f, -1.14f)
                curveToRelative(-0.32f, -1.85f, -0.98f, -3.54f, -1.89f, -5f)
                lineTo(21.4f, 7.6f)
                curveToRelative(0.34f, -0.38f, 0.32f, -0.96f, -0.04f, -1.32f)
                close()
            }
        }.build()
        
        return _Multiline_chart!!
    }

private var _Multiline_chart: ImageVector? = null

