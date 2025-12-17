package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Compress: ImageVector
    get() {
        if (_Compress != null) return _Compress!!
        
        _Compress = ImageVector.Builder(
            name = "compress",
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
                moveTo(8f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                close()
                moveToRelative(8f, -15f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                close()
                moveTo(4f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Compress!!
    }

private var _Compress: ImageVector? = null

