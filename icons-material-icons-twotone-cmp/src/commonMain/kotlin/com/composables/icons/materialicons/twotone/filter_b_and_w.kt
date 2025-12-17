package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Filter_b_and_w: ImageVector
    get() {
        if (_Filter_b_and_w != null) return _Filter_b_and_w!!
        
        _Filter_b_and_w = ImageVector.Builder(
            name = "filter_b_and_w",
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
                moveTo(19f, 5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6f)
                lineToRelative(7f, 8f)
                close()
                moveToRelative(-7f, 14f)
                verticalLineToRelative(-8f)
                lineToRelative(-7f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 19f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveToRelative(-9f, 0f)
                horizontalLineTo(5f)
                lineToRelative(7f, -8f)
                verticalLineTo(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(14f)
                lineToRelative(-7f, -8f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Filter_b_and_w!!
    }

private var _Filter_b_and_w: ImageVector? = null

