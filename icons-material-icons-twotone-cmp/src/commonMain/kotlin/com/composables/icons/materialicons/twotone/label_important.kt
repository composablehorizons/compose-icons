package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Label_important: ImageVector
    get() {
        if (_Label_important != null) return _Label_important!!
        
        _Label_important = ImageVector.Builder(
            name = "label_important",
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
                moveTo(15f, 7f)
                horizontalLineTo(7.89f)
                lineToRelative(3.57f, 5f)
                lineToRelative(-3.57f, 5f)
                horizontalLineTo(15f)
                lineToRelative(3.55f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.63f, 5.84f)
                curveTo(16.27f, 5.33f, 15.67f, 5f, 15f, 5f)
                horizontalLineTo(4f)
                lineToRelative(5f, 7f)
                lineToRelative(-5f, 6.99f)
                horizontalLineToRelative(11f)
                curveToRelative(0.67f, 0f, 1.27f, -0.32f, 1.63f, -0.83f)
                lineTo(21f, 12f)
                lineToRelative(-4.37f, -6.16f)
                close()
                moveTo(15f, 17f)
                horizontalLineTo(7.89f)
                lineToRelative(3.57f, -5f)
                lineToRelative(-3.57f, -5f)
                horizontalLineTo(15f)
                lineToRelative(3.55f, 5f)
                lineTo(15f, 17f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null

