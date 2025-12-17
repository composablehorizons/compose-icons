package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dynamic_form: ImageVector
    get() {
        if (_Dynamic_form != null) return _Dynamic_form!!
        
        _Dynamic_form = ImageVector.Builder(
            name = "dynamic_form",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 11f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(11f)
                    close()
                    moveTo(4f, 9f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(6f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    close()
                    moveTo(15f, 20f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(20f)
                    close()
                    moveTo(4f, 18f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(4f)
                    verticalLineTo(18f)
                    close()
                    moveTo(22f, 9f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(2f, -5f)
                    horizontalLineToRelative(-7f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(9f)
                    lineTo(22f, 9f)
                    close()
                    moveTo(4.75f, 17.25f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(17.25f)
                    close()
                    moveTo(4.75f, 8.25f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-1.5f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(8.25f)
                    close()
                }
            }
        }.build()
        
        return _Dynamic_form!!
    }

private var _Dynamic_form: ImageVector? = null

