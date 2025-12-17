package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CropAlt: ImageVector
    get() {
        if (_CropAlt != null) return _CropAlt!!
        
        _CropAlt = ImageVector.Builder(
            name = "crop-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488f, 352f)
                horizontalLineToRelative(-40f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(192f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(328f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
                moveTo(160f, 24f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                horizontalLineTo(88f)
                curveTo(74.75f, 0f, 64f, 10.74f, 64f, 24f)
                verticalLineToRelative(40f)
                horizontalLineTo(24f)
                curveTo(10.75f, 64f, 0f, 74.74f, 0f, 88f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(224f)
                verticalLineToRelative(-96f)
                horizontalLineTo(160f)
                verticalLineTo(24f)
                close()
            }
        }.build()
        
        return _CropAlt!!
    }

private var _CropAlt: ImageVector? = null

