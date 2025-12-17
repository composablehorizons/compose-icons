package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Filter_list_alt: ImageVector
    get() {
        if (_Filter_list_alt != null) return _Filter_list_alt!!
        
        _Filter_list_alt = ImageVector.Builder(
            name = "filter_list_alt",
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                moveToRelative(0f, 24f)
                horizontalLineTo(0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 5.66f)
                curveToRelative(0.1f, 0.13f, 5.74f, 7.33f, 5.74f, 7.33f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1.01f, 1f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.55f, 0f, 1.01f, -0.45f, 1.01f, -1f)
                verticalLineToRelative(-6.02f)
                reflectiveCurveToRelative(5.49f, -7.02f, 5.75f, -7.34f)
                curveTo(20.03f, 5.32f, 20f, 5f, 20f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1.01f, -1f)
                horizontalLineTo(5.01f)
                curveTo(4.4f, 4f, 4f, 4.48f, 4f, 5f)
                curveToRelative(0f, 0.2f, 0.06f, 0.44f, 0.25f, 0.66f)
                close()
            }
        }.build()
        
        return _Filter_list_alt!!
    }

private var _Filter_list_alt: ImageVector? = null

