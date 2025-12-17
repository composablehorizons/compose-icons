package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.IdBadge: ImageVector
    get() {
        if (_IdBadge != null) return _IdBadge!!
        
        _IdBadge = ImageVector.Builder(
            name = "id-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 0f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(0f, 464f)
                horizontalLineTo(48f)
                verticalLineTo(48f)
                horizontalLineToRelative(288f)
                verticalLineToRelative(416f)
                close()
                moveTo(144f, 112f)
                horizontalLineToRelative(96f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(48f, 176f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
                moveToRelative(-89.6f, 128f)
                horizontalLineToRelative(179.2f)
                curveToRelative(12.4f, 0f, 22.4f, -8.6f, 22.4f, -19.2f)
                verticalLineToRelative(-19.2f)
                curveToRelative(0f, -31.8f, -30.1f, -57.6f, -67.2f, -57.6f)
                curveToRelative(-10.8f, 0f, -18.7f, 8f, -44.8f, 8f)
                curveToRelative(-26.9f, 0f, -33.4f, -8f, -44.8f, -8f)
                curveToRelative(-37.1f, 0f, -67.2f, 25.8f, -67.2f, 57.6f)
                verticalLineToRelative(19.2f)
                curveToRelative(0f, 10.6f, 10f, 19.2f, 22.4f, 19.2f)
                close()
            }
        }.build()
        
        return _IdBadge!!
    }

private var _IdBadge: ImageVector? = null

