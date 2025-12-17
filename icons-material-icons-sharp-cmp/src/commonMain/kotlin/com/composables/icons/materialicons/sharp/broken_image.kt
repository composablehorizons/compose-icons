package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Broken_image: ImageVector
    get() {
        if (_Broken_image != null) return _Broken_image!!
        
        _Broken_image = ImageVector.Builder(
            name = "broken_image",
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
                moveTo(21f, 3f)
                verticalLineToRelative(8.59f)
                lineToRelative(-3f, -3.01f)
                lineToRelative(-4f, 4.01f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                lineToRelative(-3f, -3.01f)
                verticalLineTo(3f)
                horizontalLineToRelative(18f)
                close()
                moveToRelative(-3f, 8.42f)
                lineToRelative(3f, 3.01f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-8.58f)
                lineToRelative(3f, 2.99f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -3.99f)
                close()
            }
        }.build()
        
        return _Broken_image!!
    }

private var _Broken_image: ImageVector? = null

