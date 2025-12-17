package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Domain_disabled: ImageVector
    get() {
        if (_Domain_disabled != null) return _Domain_disabled!!
        
        _Domain_disabled = ImageVector.Builder(
            name = "domain_disabled",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.9f)
                lineTo(12f, 9.9f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8.9f)
                lineToRelative(2f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(5.1f)
                lineTo(8f, 5.9f)
                close()
                moveToRelative(8f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(1.3f, 1.8f)
                lineTo(0.1f, 3.1f)
                lineTo(2f, 5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                lineToRelative(3f, 3f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21f, -20.9f)
                close()
                moveTo(6f, 19f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 8f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Domain_disabled!!
    }

private var _Domain_disabled: ImageVector? = null

