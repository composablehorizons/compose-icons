package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Work: ImageVector
    get() {
        if (_Work != null) return _Work!!
        
        _Work = ImageVector.Builder(
            name = "work",
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
                moveTo(22f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Work!!
    }

private var _Work: ImageVector? = null

