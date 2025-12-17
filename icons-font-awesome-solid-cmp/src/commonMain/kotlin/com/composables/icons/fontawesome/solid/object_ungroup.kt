package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ObjectUngroup: ImageVector
    get() {
        if (_ObjectUngroup != null) return _ObjectUngroup!!
        
        _ObjectUngroup = ImageVector.Builder(
            name = "object-ungroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 320f)
                verticalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineTo(6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineToRelative(-52f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(26f)
                verticalLineTo(96f)
                horizontalLineTo(6f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(38f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(26f)
                horizontalLineToRelative(288f)
                verticalLineTo(38f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-26f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, 6f)
                verticalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                horizontalLineToRelative(-52f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineToRelative(-26f)
                horizontalLineTo(64f)
                close()
                moveToRelative(480f, -64f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-52f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                horizontalLineToRelative(-52f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(26f)
                horizontalLineTo(408f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(8f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineToRelative(-64f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-8f)
                horizontalLineTo(192f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(-26f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-26f)
                horizontalLineToRelative(288f)
                verticalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(52f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-52f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                horizontalLineToRelative(-26f)
                verticalLineTo(256f)
                close()
            }
        }.build()
        
        return _ObjectUngroup!!
    }

private var _ObjectUngroup: ImageVector? = null

