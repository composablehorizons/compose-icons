package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Settings_bluetooth: ImageVector
    get() {
        if (_Settings_bluetooth != null) return _Settings_bluetooth!!
        
        _Settings_bluetooth = ImageVector.Builder(
            name = "settings_bluetooth",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(8f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2.71f, -18.29f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7.59f)
                lineTo(6.41f, 3f)
                lineTo(5f, 4.41f)
                lineTo(10.59f, 10f)
                lineTo(5f, 15.59f)
                lineTo(6.41f, 17f)
                lineTo(11f, 12.41f)
                verticalLineTo(20f)
                horizontalLineToRelative(1f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-4.3f, -4.29f)
                lineToRelative(4.3f, -4.29f)
                close()
                moveTo(13f, 3.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13f, 7.59f)
                verticalLineTo(3.83f)
                close()
                moveToRelative(1.88f, 10.46f)
                lineTo(13f, 16.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
            }
        }.build()
        
        return _Settings_bluetooth!!
    }

private var _Settings_bluetooth: ImageVector? = null

