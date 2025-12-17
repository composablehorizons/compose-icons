package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Microwave: ImageVector
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
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(12f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4f)
                verticalLineTo(18f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                close()
                moveTo(18f, 13f)
                lineTo(18f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0f)
                curveTo(19f, 12.55f, 18.55f, 13f, 18f, 13f)
                close()
                moveTo(18f, 17f)
                lineTo(18f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0f)
                curveTo(19f, 16.55f, 18.55f, 17f, 18f, 17f)
                close()
                moveTo(10.25f, 16f)
                curveToRelative(-0.79f, 0f, -1.37f, -0.38f, -1.79f, -0.66f)
                curveTo(8.13f, 15.12f, 7.94f, 15f, 7.75f, 15f)
                curveToRelative(-0.37f, 0f, -0.8f, 0.41f, -0.95f, 0.61f)
                lineToRelative(-1.42f, -1.42f)
                curveTo(5.73f, 13.79f, 6.59f, 13f, 7.75f, 13f)
                curveToRelative(0.8f, 0f, 1.39f, 0.39f, 1.81f, 0.67f)
                curveTo(9.87f, 13.88f, 10.07f, 14f, 10.25f, 14f)
                curveToRelative(0.37f, 0f, 0.8f, -0.41f, 0.95f, -0.61f)
                lineToRelative(1.42f, 1.42f)
                curveTo(12.26f, 15.21f, 11.41f, 16f, 10.25f, 16f)
                close()
                moveTo(10.25f, 11f)
                curveToRelative(-0.79f, 0f, -1.37f, -0.38f, -1.79f, -0.66f)
                curveTo(8.13f, 10.12f, 7.94f, 10f, 7.75f, 10f)
                curveToRelative(-0.37f, 0f, -0.8f, 0.41f, -0.95f, 0.61f)
                lineTo(5.37f, 9.19f)
                curveTo(5.73f, 8.79f, 6.59f, 8f, 7.75f, 8f)
                curveToRelative(0.8f, 0f, 1.39f, 0.39f, 1.81f, 0.67f)
                curveTo(9.87f, 8.88f, 10.07f, 9f, 10.25f, 9f)
                curveToRelative(0.37f, 0f, 0.8f, -0.41f, 0.95f, -0.61f)
                lineToRelative(1.42f, 1.42f)
                curveTo(12.26f, 10.21f, 11.41f, 11f, 10.25f, 11f)
                close()
            }
        }.build()
        
        return _Microwave!!
    }

private var _Microwave: ImageVector? = null

