package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Area_chart: ImageVector
    get() {
        if (_Area_chart != null) return _Area_chart!!
        
        _Area_chart = ImageVector.Builder(
            name = "area_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 17f)
                lineToRelative(3.39f, -4.66f)
                curveToRelative(0.33f, -0.46f, 0.98f, -0.55f, 1.42f, -0.2f)
                lineTo(21f, 18.5f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineToRelative(0f, -5.72f)
                curveToRelative(0.22f, 0f, 0.44f, 0.07f, 0.62f, 0.22f)
                lineTo(8f, 17f)
                close()
                moveTo(3f, 11f)
                curveToRelative(0.44f, 0f, 0.88f, 0.15f, 1.25f, 0.44f)
                lineToRelative(3.37f, 2.69f)
                lineToRelative(2.77f, -3.81f)
                curveToRelative(0.66f, -0.91f, 1.95f, -1.1f, 2.85f, -0.4f)
                lineTo(21f, 15.97f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                lineToRelative(-4.18f, -3.34f)
                curveToRelative(-0.45f, -0.36f, -1.1f, -0.27f, -1.44f, 0.2f)
                lineTo(7f, 10f)
                lineTo(3.6f, 7.45f)
                curveTo(3.42f, 7.32f, 3.21f, 7.25f, 3f, 7.25f)
                lineTo(3f, 11f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null

