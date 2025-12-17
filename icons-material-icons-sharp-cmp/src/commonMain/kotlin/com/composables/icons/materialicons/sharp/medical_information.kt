package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Medical_information: ImageVector
    get() {
        if (_Medical_information != null) return _Medical_information!!
        
        _Medical_information = ImageVector.Builder(
            name = "medical_information",
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
                    moveTo(22f, 7f)
                    horizontalLineToRelative(-7f)
                    verticalLineTo(2f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(15f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(7f)
                    close()
                    moveTo(11f, 4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(11f, 16f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(13f, 14.5f)
                    verticalLineTo(13f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(13f, 17.5f)
                    verticalLineTo(16f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(1.5f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Medical_information!!
    }

private var _Medical_information: ImageVector? = null

