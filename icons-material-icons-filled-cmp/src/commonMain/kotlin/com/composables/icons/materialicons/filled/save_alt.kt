package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Save_alt: ImageVector
    get() {
        if (_Save_alt != null) return _Save_alt!!
        
        _Save_alt = ImageVector.Builder(
            name = "save_alt",
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
                moveTo(19f, 12f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                verticalLineToRelative(-7f)
                horizontalLineTo(3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-6f, 0.67f)
                lineToRelative(2.59f, -2.58f)
                lineTo(17f, 11.5f)
                lineToRelative(-5f, 5f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11f, 12.67f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Save_alt!!
    }

private var _Save_alt: ImageVector? = null

