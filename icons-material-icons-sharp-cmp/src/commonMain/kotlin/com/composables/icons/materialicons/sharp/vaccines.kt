package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Vaccines: ImageVector
    get() {
        if (_Vaccines != null) return _Vaccines!!
        
        _Vaccines = ImageVector.Builder(
            name = "vaccines",
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
                moveTo(12f, 5.5f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0f, 0.45f, 0f, 1f, 0f)
                verticalLineTo(17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineToRelative(2f, 1.5f)
                verticalLineTo(17f)
                horizontalLineToRelative(3f)
                verticalLineTo(7.5f)
                curveToRelative(0.55f, 0f, 1f, 0f, 1f, 0f)
                verticalLineTo(5.5f)
                close()
                moveTo(9f, 9f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9f)
                lineTo(9f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(9f)
                close()
                moveTo(19.5f, 10.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                horizontalLineToRelative(-7f)
                lineToRelative(-0.01f, 2f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.5f, -1.5f, 1.16f, -1.5f, 3f)
                verticalLineTo(22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8.5f)
                curveTo(21f, 11.66f, 19.5f, 11f, 19.5f, 10.5f)
                close()
                moveTo(16.5f, 10.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.6f, 1.5f, 2f, 1.5f, 3f)
                verticalLineTo(14f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -0.21f, 0f, -0.39f, 0f, -0.5f)
                curveTo(15f, 12.5f, 16.5f, 12.1f, 16.5f, 10.5f)
                close()
                moveTo(15f, 20f)
                curveToRelative(0f, 0f, 0f, -0.63f, 0f, -1.5f)
                horizontalLineToRelative(4f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                close()
            }
        }.build()
        
        return _Vaccines!!
    }

private var _Vaccines: ImageVector? = null

