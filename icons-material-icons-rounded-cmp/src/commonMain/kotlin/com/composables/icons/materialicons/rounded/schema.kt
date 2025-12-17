package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Schema: ImageVector
    get() {
        if (_Schema != null) return _Schema!!
        
        _Schema = ImageVector.Builder(
            name = "schema",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(14f, 10.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveTo(11f, 9.67f, 10.33f, 9f, 9.5f, 9f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                curveTo(10.33f, 7f, 11f, 6.33f, 11f, 5.5f)
                verticalLineToRelative(-3f)
                curveTo(11f, 1.67f, 10.33f, 1f, 9.5f, 1f)
                horizontalLineToRelative(-4f)
                curveTo(4.67f, 1f, 4f, 1.67f, 4f, 2.5f)
                verticalLineToRelative(3f)
                curveTo(4f, 6.33f, 4.67f, 7f, 5.5f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveTo(4.67f, 9f, 4f, 9.67f, 4f, 10.5f)
                verticalLineToRelative(3f)
                curveTo(4f, 14.33f, 4.67f, 15f, 5.5f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveTo(4.67f, 17f, 4f, 17.67f, 4f, 18.5f)
                verticalLineToRelative(3f)
                curveTo(4f, 22.33f, 4.67f, 23f, 5.5f, 23f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveTo(21f, 9.67f, 20.33f, 9f, 19.5f, 9f)
                horizontalLineToRelative(-4f)
                curveTo(14.67f, 9f, 14f, 9.67f, 14f, 10.5f)
                close()
            }
        }.build()
        
        return _Schema!!
    }

private var _Schema: ImageVector? = null

