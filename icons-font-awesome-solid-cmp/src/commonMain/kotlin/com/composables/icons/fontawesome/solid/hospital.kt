package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hospital: ImageVector
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
                moveTo(448f, 492f)
                verticalLineToRelative(20f)
                horizontalLineTo(0f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(20f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(88f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(112f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(88f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(20f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                close()
                moveTo(308f, 192f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
                moveToRelative(-168f, 64f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                close()
                moveToRelative(104f, 128f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-84f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
                moveToRelative(64f, -96f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                close()
                moveToRelative(-116f, 12f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-40f)
                close()
                moveTo(182f, 96f)
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
                close()
            }
        }.build()
        
        return _Hospital!!
    }

private var _Hospital: ImageVector? = null

