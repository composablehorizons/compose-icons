package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Open_with: ImageVector
    get() {
        if (_Open_with != null) return _Open_with!!
        
        _Open_with = ImageVector.Builder(
            name = "open_with",
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
                moveTo(10f, 9f)
                horizontalLineToRelative(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(3f)
                lineToRelative(-5f, -5f)
                lineToRelative(-5f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-1f, 1f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(14f, 2f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineToRelative(5f, -5f)
                close()
                moveToRelative(-9f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                lineToRelative(5f, 5f)
                lineToRelative(5f, -5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Open_with!!
    }

private var _Open_with: ImageVector? = null

