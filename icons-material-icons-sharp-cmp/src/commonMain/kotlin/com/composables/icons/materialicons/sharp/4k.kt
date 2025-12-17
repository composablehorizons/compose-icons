package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`4k`: ImageVector
    get() {
        if (_4k != null) return _4k!!
        
        _4k = ImageVector.Builder(
            name = "4k",
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
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                close()
                moveToRelative(-9f, 10.51f)
                horizontalLineToRelative(-1f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.51f)
                close()
                moveTo(18.2f, 15f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2f, -3f)
                verticalLineToRelative(3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                lineToRelative(2f, -3f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                close()
            }
        }.build()
        
        return _4k!!
    }

private var _4k: ImageVector? = null

