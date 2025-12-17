package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Microwave: ImageVector
    get() {
        if (_Microwave != null) return _Microwave!!
        
        _Microwave = ImageVector.Builder(
            name = "microwave",
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
                moveTo(6.8f, 10.61f)
                lineTo(5.37f, 9.19f)
                curveTo(5.73f, 8.79f, 6.59f, 8f, 7.75f, 8f)
                curveToRelative(0.8f, 0f, 1.39f, 0.39f, 1.81f, 0.67f)
                curveTo(9.87f, 8.88f, 10.07f, 9f, 10.25f, 9f)
                curveToRelative(0.37f, 0f, 0.8f, -0.41f, 0.95f, -0.61f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(-0.36f, 0.4f, -1.22f, 1.19f, -2.37f, 1.19f)
                curveToRelative(-0.79f, 0f, -1.37f, -0.38f, -1.79f, -0.66f)
                curveTo(8.13f, 10.12f, 7.94f, 10f, 7.75f, 10f)
                curveTo(7.38f, 10f, 6.95f, 10.41f, 6.8f, 10.61f)
                close()
                moveTo(7.75f, 15f)
                curveToRelative(0.19f, 0f, 0.38f, 0.12f, 0.71f, 0.34f)
                curveToRelative(0.42f, 0.28f, 1f, 0.66f, 1.79f, 0.66f)
                curveToRelative(1.16f, 0f, 2.01f, -0.79f, 2.37f, -1.19f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(-0.15f, 0.2f, -0.59f, 0.61f, -0.95f, 0.61f)
                curveToRelative(-0.18f, 0f, -0.38f, -0.12f, -0.69f, -0.33f)
                curveTo(9.14f, 13.39f, 8.55f, 13f, 7.75f, 13f)
                curveToRelative(-1.16f, 0f, -2.02f, 0.79f, -2.38f, 1.19f)
                lineToRelative(1.42f, 1.42f)
                curveTo(6.95f, 15.41f, 7.38f, 15f, 7.75f, 15f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                close()
                moveTo(14f, 6f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(10f)
                verticalLineTo(6f)
                close()
                moveTo(19f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveTo(18.55f, 17f, 19f, 16.55f, 19f, 16f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveTo(18.55f, 13f, 19f, 12.55f, 19f, 12f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Microwave!!
    }

private var _Microwave: ImageVector? = null

