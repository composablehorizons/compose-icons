package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FirstAid: ImageVector
    get() {
        if (_FirstAid != null) return _FirstAid!!
        
        _FirstAid = ImageVector.Builder(
            name = "first-aid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(48f)
                verticalLineTo(32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                close()
                moveToRelative(128f, 400f)
                horizontalLineToRelative(320f)
                verticalLineTo(32f)
                horizontalLineTo(128f)
                verticalLineToRelative(448f)
                close()
                moveToRelative(64f, -248f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(56f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(-56f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-48f)
                close()
                moveTo(528f, 32f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(448f)
                horizontalLineToRelative(48f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _FirstAid!!
    }

private var _FirstAid: ImageVector? = null

