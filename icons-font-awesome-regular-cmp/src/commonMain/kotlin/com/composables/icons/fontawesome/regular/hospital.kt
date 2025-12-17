package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Hospital: ImageVector
    get() {
        if (_Hospital != null) return _Hospital!!
        
        _Hospital = ImageVector.Builder(
            name = "hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 244f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                close()
                moveToRelative(140f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                close()
                moveToRelative(-76f, 84f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                close()
                moveToRelative(76f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                close()
                moveToRelative(180f, 124f)
                verticalLineToRelative(36f)
                horizontalLineTo(0f)
                verticalLineToRelative(-36f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(19.5f)
                verticalLineTo(85.035f)
                curveTo(31.5f, 73.418f, 42.245f, 64f, 55.5f, 64f)
                horizontalLineTo(144f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(112f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(88.5f)
                curveToRelative(13.255f, 0f, 24f, 9.418f, 24f, 21.035f)
                verticalLineTo(464f)
                horizontalLineTo(436f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                close()
                moveTo(79.5f, 463f)
                horizontalLineTo(192f)
                verticalLineToRelative(-67f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(67f)
                horizontalLineToRelative(112.5f)
                verticalLineTo(112f)
                horizontalLineTo(304f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(168f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-24f)
                horizontalLineTo(79.5f)
                verticalLineToRelative(351f)
                close()
                moveTo(266f, 64f)
                horizontalLineToRelative(-26f)
                verticalLineTo(38f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                horizontalLineToRelative(-20f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(26f)
                horizontalLineToRelative(-26f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(20f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(26f)
                verticalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(20f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineTo(96f)
                horizontalLineToRelative(26f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineTo(70f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                close()
            }
        }.build()
        
        return _Hospital!!
    }

private var _Hospital: ImageVector? = null

