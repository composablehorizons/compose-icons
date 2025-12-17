package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Apartment: ImageVector
    get() {
        if (_Apartment != null) return _Apartment!!
        
        _Apartment = ImageVector.Builder(
            name = "apartment",
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
                    moveTo(17f, 11f)
                    verticalLineTo(3f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(11f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(7f, 19f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(7f, 15f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(7f, 11f)
                    horizontalLineTo(5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(11f, 15f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(11f, 11f)
                    horizontalLineTo(9f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(11f, 7f)
                    horizontalLineTo(9f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(15f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(15f, 11f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(15f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(19f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Apartment!!
    }

private var _Apartment: ImageVector? = null

