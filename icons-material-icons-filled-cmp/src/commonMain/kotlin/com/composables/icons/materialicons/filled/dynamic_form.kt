package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Dynamic_form: ImageVector
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
                    moveTo(17f, 20f)
                    verticalLineToRelative(-9f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(7f)
                    lineToRelative(-2f, 5f)
                    horizontalLineToRelative(2f)
                    lineTo(17f, 20f)
                    close()
                    moveTo(15f, 13f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(6.25f, 15.75f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(15.75f)
                    close()
                    moveTo(13f, 4f)
                    verticalLineToRelative(7f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(6.25f, 6.75f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(6.75f)
                    close()
                }
            }
        }.build()
        
        return _Dynamic_form!!
    }

private var _Dynamic_form: ImageVector? = null

