package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Edit_off: ImageVector
    get() {
        if (_Edit_off != null) return _Edit_off!!
        
        _Edit_off = ImageVector.Builder(
            name = "edit_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.126f, 8.125f)
                lineToRelative(1.937f, -1.937f)
                lineToRelative(3.747f, 3.747f)
                lineToRelative(-1.937f, 1.938f)
                close()
                moveTo(20.71f, 5.63f)
                lineToRelative(-2.34f, -2.34f)
                arcToRelative(1f, 1f, 0f, false, false, -1.41f, 0f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineTo(20.71f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.37f)
                close()
                moveTo(2f, 5f)
                lineToRelative(6.63f, 6.63f)
                lineTo(3f, 17.25f)
                verticalLineTo(21f)
                horizontalLineToRelative(3.75f)
                lineToRelative(5.63f, -5.62f)
                lineTo(18f, 21f)
                lineToRelative(2f, -2f)
                lineTo(4f, 3f)
                lineTo(2f, 5f)
                close()
            }
        }.build()
        
        return _Edit_off!!
    }

private var _Edit_off: ImageVector? = null

