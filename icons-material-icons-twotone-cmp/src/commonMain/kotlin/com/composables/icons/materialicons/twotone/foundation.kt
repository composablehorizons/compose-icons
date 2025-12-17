package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Foundation: ImageVector
    get() {
        if (_Foundation != null) return _Foundation!!
        
        _Foundation = ImageVector.Builder(
            name = "foundation",
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
                moveTo(7f, 15f)
                verticalLineToRelative(-4.81f)
                lineToRelative(4f, -3.6f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                close()
                moveTo(13f, 15f)
                verticalLineTo(6.59f)
                lineToRelative(4f, 3.6f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 12f)
                horizontalLineToRelative(3f)
                lineTo(12f, 3f)
                lineTo(2f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(12f)
                close()
                moveTo(7f, 15f)
                verticalLineToRelative(-4.81f)
                lineToRelative(4f, -3.6f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                close()
                moveTo(13f, 15f)
                verticalLineTo(6.59f)
                lineToRelative(4f, 3.6f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Foundation!!
    }

private var _Foundation: ImageVector? = null

