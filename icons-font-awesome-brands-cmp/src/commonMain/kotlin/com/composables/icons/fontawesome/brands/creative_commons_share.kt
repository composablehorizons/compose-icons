package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsShare: ImageVector
    get() {
        if (_CreativeCommonsShare != null) return _CreativeCommonsShare!!
        
        _CreativeCommonsShare = ImageVector.Builder(
            name = "creative-commons-share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.6f, 8f)
                curveTo(389.4f, 8f, 496f, 118.1f, 496f, 256f)
                curveToRelative(0f, 147.1f, -118.5f, 248f, -248.4f, 248f)
                curveTo(113.6f, 504f, 0f, 394.5f, 0f, 256f)
                curveTo(0f, 123.1f, 104.7f, 8f, 247.6f, 8f)
                close()
                moveToRelative(0.8f, 44.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256f)
                curveToRelative(0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
                moveToRelative(101f, 132.4f)
                curveToRelative(7.8f, 0f, 13.7f, 6.1f, 13.7f, 13.7f)
                verticalLineToRelative(182.5f)
                curveToRelative(0f, 7.7f, -6.1f, 13.7f, -13.7f, 13.7f)
                horizontalLineTo(214.3f)
                curveToRelative(-7.7f, 0f, -13.7f, -6f, -13.7f, -13.7f)
                verticalLineToRelative(-54f)
                horizontalLineToRelative(-54f)
                curveToRelative(-7.8f, 0f, -13.7f, -6f, -13.7f, -13.7f)
                verticalLineTo(131.1f)
                curveToRelative(0f, -8.2f, 6.6f, -12.7f, 12.4f, -13.7f)
                horizontalLineToRelative(136.4f)
                curveToRelative(7.7f, 0f, 13.7f, 6f, 13.7f, 13.7f)
                verticalLineToRelative(54f)
                horizontalLineToRelative(54f)
                close()
                moveTo(159.9f, 300.3f)
                horizontalLineToRelative(40.7f)
                verticalLineTo(198.9f)
                curveToRelative(0f, -7.4f, 5.8f, -12.6f, 12f, -13.7f)
                horizontalLineToRelative(55.8f)
                verticalLineToRelative(-40.3f)
                horizontalLineTo(159.9f)
                verticalLineToRelative(155.4f)
                close()
                moveToRelative(176.2f, -88.1f)
                horizontalLineTo(227.6f)
                verticalLineToRelative(155.4f)
                horizontalLineToRelative(108.5f)
                verticalLineTo(212.2f)
                close()
            }
        }.build()
        
        return _CreativeCommonsShare!!
    }

private var _CreativeCommonsShare: ImageVector? = null

