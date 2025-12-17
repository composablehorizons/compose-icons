package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Repeat_one: ImageVector
    get() {
        if (_Repeat_one != null) return _Repeat_one!!
        
        _Repeat_one = ImageVector.Builder(
            name = "repeat_one",
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
                moveTo(13f, 15f)
                verticalLineTo(9f)
                horizontalLineToRelative(-1f)
                lineToRelative(-2f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(6f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                close()
                moveTo(17f, 2f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineToRelative(4f, -4f)
                close()
            }
        }.build()
        
        return _Repeat_one!!
    }

private var _Repeat_one: ImageVector? = null

