package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cleaning_services: ImageVector
    get() {
        if (_Cleaning_services != null) return _Cleaning_services!!
        
        _Cleaning_services = ImageVector.Builder(
            name = "cleaning_services",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15f, 11f)
                    verticalLineTo(1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(11f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(19f, 21f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(21f)
                    close()
                }
            }
        }.build()
        
        return _Cleaning_services!!
    }

private var _Cleaning_services: ImageVector? = null

