package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stay_primary_portrait: ImageVector
    get() {
        if (_Stay_primary_portrait != null) return _Stay_primary_portrait!!
        
        _Stay_primary_portrait = ImageVector.Builder(
            name = "stay_primary_portrait",
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
                moveTo(5.01f, 1f)
                verticalLineToRelative(22f)
                horizontalLineTo(19f)
                verticalLineTo(1f)
                horizontalLineTo(5.01f)
                close()
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Stay_primary_portrait!!
    }

private var _Stay_primary_portrait: ImageVector? = null

