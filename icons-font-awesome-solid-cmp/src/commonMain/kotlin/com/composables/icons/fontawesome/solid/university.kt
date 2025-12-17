package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.University: ImageVector
    get() {
        if (_University != null) return _University!!
        
        _University = ImageVector.Builder(
            name = "university",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 128f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(60f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-12f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                verticalLineToRelative(-16f)
                arcToRelative(8f, 8f, 0f, false, true, 4.941f, -7.392f)
                lineToRelative(232f, -88f)
                arcToRelative(7.996f, 7.996f, 0f, false, true, 6.118f, 0f)
                lineToRelative(232f, 88f)
                arcTo(8f, 8f, 0f, false, true, 496f, 128f)
                close()
                moveToRelative(-24f, 304f)
                horizontalLineTo(40f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                horizontalLineToRelative(464f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveTo(96f, 192f)
                verticalLineToRelative(192f)
                horizontalLineTo(60f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(416f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-36f)
                verticalLineTo(192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-64f)
                verticalLineTo(192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-64f)
                verticalLineTo(192f)
                horizontalLineTo(96f)
                close()
            }
        }.build()
        
        return _University!!
    }

private var _University: ImageVector? = null

