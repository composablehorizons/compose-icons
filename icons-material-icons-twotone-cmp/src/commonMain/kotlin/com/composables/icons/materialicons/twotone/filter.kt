package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Filter: ImageVector
    get() {
        if (_Filter != null) return _Filter!!
        
        _Filter = ImageVector.Builder(
            name = "filter",
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
                moveTo(7f, 17f)
                horizontalLineToRelative(14f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(4.25f, -5.53f)
                lineToRelative(1.96f, 2.36f)
                lineToRelative(2.75f, -3.54f)
                lineTo(19.5f, 15f)
                horizontalLineToRelative(-11f)
                lineToRelative(2.75f, -3.53f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 21f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                close()
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-5.04f, -6.71f)
                lineToRelative(-2.75f, 3.54f)
                lineToRelative(-1.96f, -2.36f)
                lineTo(8.5f, 15f)
                horizontalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Filter!!
    }

private var _Filter: ImageVector? = null

