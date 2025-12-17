package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Check_box: ImageVector
    get() {
        if (_Check_box != null) return _Check_box!!
        
        _Check_box = ImageVector.Builder(
            name = "check_box",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(2.41f, -7.4f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(6.59f, -6.59f)
                lineTo(17.99f, 9f)
                lineToRelative(-8f, 8f)
                lineTo(6f, 13.01f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveTo(17.99f, 9f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-6.59f, 6.59f)
                lineToRelative(-2.58f, -2.57f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(4f, 3.99f)
                close()
            }
        }.build()
        
        return _Check_box!!
    }

private var _Check_box: ImageVector? = null

