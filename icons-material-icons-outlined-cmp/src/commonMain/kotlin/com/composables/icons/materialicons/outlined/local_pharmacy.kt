package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_pharmacy: ImageVector
    get() {
        if (_Local_pharmacy != null) return _Local_pharmacy!!
        
        _Local_pharmacy = ImageVector.Builder(
            name = "local_pharmacy",
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
                moveTo(21f, 5f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(1.14f, -3.14f)
                lineTo(17.15f, 1f)
                lineToRelative(-1.46f, 4f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                lineToRelative(2f, 6f)
                lineToRelative(-2f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                lineToRelative(-2f, -6f)
                lineToRelative(2f, -6f)
                verticalLineTo(5f)
                close()
                moveToRelative(-3.9f, 8.63f)
                lineTo(18.89f, 19f)
                horizontalLineTo(5.11f)
                lineToRelative(1.79f, -5.37f)
                lineToRelative(0.21f, -0.63f)
                lineToRelative(-0.21f, -0.63f)
                lineTo(5.11f, 7f)
                horizontalLineToRelative(13.78f)
                lineToRelative(-1.79f, 5.37f)
                lineToRelative(-0.21f, 0.63f)
                lineToRelative(0.21f, 0.63f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Local_pharmacy!!
    }

private var _Local_pharmacy: ImageVector? = null

