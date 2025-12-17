package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Barcode: ImageVector
    get() {
        if (_Barcode != null) return _Barcode!!
        
        _Barcode = ImageVector.Builder(
            name = "barcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 448f)
                verticalLineTo(64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(384f)
                horizontalLineTo(0f)
                close()
                moveToRelative(26.857f, -0.273f)
                verticalLineTo(64f)
                horizontalLineTo(36f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-9.143f)
                close()
                moveToRelative(27.143f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineTo(54f)
                close()
                moveToRelative(44.857f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveToRelative(36f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(17.714f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-17.714f)
                close()
                moveToRelative(44.857f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveToRelative(18f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveToRelative(18f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(8.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-8.857f)
                close()
                moveToRelative(35.715f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18f)
                close()
                moveToRelative(44.857f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18f)
                close()
                moveToRelative(35.999f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.001f)
                close()
                moveToRelative(36.001f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(18.001f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18.001f)
                close()
                moveToRelative(26.857f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-18f)
                close()
                moveToRelative(45.143f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(26.857f)
                verticalLineToRelative(383.727f)
                horizontalLineToRelative(-26.857f)
                close()
                moveToRelative(35.714f, 0f)
                verticalLineTo(64f)
                horizontalLineToRelative(9.143f)
                verticalLineToRelative(383.727f)
                horizontalLineTo(476f)
                close()
                moveToRelative(18f, 0.273f)
                verticalLineTo(64f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(-18f)
                close()
            }
        }.build()
        
        return _Barcode!!
    }

private var _Barcode: ImageVector? = null

