package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 336f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineTo(0f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 25.6f, 22.4f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(25.6f, 0f, 48f, -22.4f, 48f, -48f)
                verticalLineTo(288f)
                horizontalLineTo(320f)
                verticalLineToRelative(48f)
                close()
                moveToRelative(144f, -208f)
                horizontalLineToRelative(-80f)
                verticalLineTo(80f)
                curveToRelative(0f, -25.6f, -22.4f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-25.6f, 0f, -48f, 22.4f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-25.6f, 0f, -48f, 22.4f, -48f, 48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(512f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -25.6f, -22.4f, -48f, -48f, -48f)
                close()
                moveToRelative(-144f, 0f)
                horizontalLineTo(192f)
                verticalLineTo(96f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                close()
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

