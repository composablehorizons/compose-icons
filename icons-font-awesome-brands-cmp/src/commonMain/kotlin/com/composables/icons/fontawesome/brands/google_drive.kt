package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GoogleDrive: ImageVector
    get() {
        if (_GoogleDrive != null) return _GoogleDrive!!
        
        _GoogleDrive = ImageVector.Builder(
            name = "google-drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(339f, 314.9f)
                lineTo(175.4f, 32f)
                horizontalLineToRelative(161.2f)
                lineToRelative(163.6f, 282.9f)
                horizontalLineTo(339f)
                close()
                moveToRelative(-137.5f, 23.6f)
                lineTo(120.9f, 480f)
                horizontalLineToRelative(310.5f)
                lineTo(512f, 338.5f)
                horizontalLineTo(201.5f)
                close()
                moveTo(154.1f, 67.4f)
                lineTo(0f, 338.5f)
                lineTo(80.6f, 480f)
                lineTo(237f, 208.8f)
                lineTo(154.1f, 67.4f)
                close()
            }
        }.build()
        
        return _GoogleDrive!!
    }

private var _GoogleDrive: ImageVector? = null

