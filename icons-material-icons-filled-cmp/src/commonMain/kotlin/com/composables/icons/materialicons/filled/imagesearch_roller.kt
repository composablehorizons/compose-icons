package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Imagesearch_roller: ImageVector
    get() {
        if (_Imagesearch_roller != null) return _Imagesearch_roller!!
        
        _Imagesearch_roller = ImageVector.Builder(
            name = "imagesearch_roller",
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                verticalLineToRelative(6f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _Imagesearch_roller!!
    }

private var _Imagesearch_roller: ImageVector? = null

