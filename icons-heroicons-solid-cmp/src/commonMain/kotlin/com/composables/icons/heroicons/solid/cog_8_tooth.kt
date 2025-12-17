package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Cog8Tooth: ImageVector
    get() {
        if (_Cog8Tooth != null) return _Cog8Tooth!!
        
        _Cog8Tooth = ImageVector.Builder(
            name = "cog-8-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.828f, 2.25f)
                curveToRelative(-0.916f, 0f, -1.699f, 0.663f, -1.85f, 1.567f)
                lineToRelative(-0.091f, 0.549f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.517f, 0.608f)
                arcToRelative(7.45f, 7.45f, 0f, false, false, -0.478f, 0.198f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.796f, -0.064f)
                lineToRelative(-0.453f, -0.324f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -2.416f, 0.2f)
                lineToRelative(-0.243f, 0.243f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -0.2f, 2.416f)
                lineToRelative(0.324f, 0.453f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, 0.064f, 0.796f)
                arcToRelative(7.448f, 7.448f, 0f, false, false, -0.198f, 0.478f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.608f, 0.517f)
                lineToRelative(-0.55f, 0.092f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -1.566f, 1.849f)
                verticalLineToRelative(0.344f)
                curveToRelative(0f, 0.916f, 0.663f, 1.699f, 1.567f, 1.85f)
                lineToRelative(0.549f, 0.091f)
                curveToRelative(0.281f, 0.047f, 0.508f, 0.25f, 0.608f, 0.517f)
                curveToRelative(0.06f, 0.162f, 0.127f, 0.321f, 0.198f, 0.478f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.064f, 0.796f)
                lineToRelative(-0.324f, 0.453f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 0.2f, 2.416f)
                lineToRelative(0.243f, 0.243f)
                curveToRelative(0.648f, 0.648f, 1.67f, 0.733f, 2.416f, 0.2f)
                lineToRelative(0.453f, -0.324f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, 0.796f, -0.064f)
                curveToRelative(0.157f, 0.071f, 0.316f, 0.137f, 0.478f, 0.198f)
                curveToRelative(0.267f, 0.1f, 0.47f, 0.327f, 0.517f, 0.608f)
                lineToRelative(0.092f, 0.55f)
                curveToRelative(0.15f, 0.903f, 0.932f, 1.566f, 1.849f, 1.566f)
                horizontalLineToRelative(0.344f)
                curveToRelative(0.916f, 0f, 1.699f, -0.663f, 1.85f, -1.567f)
                lineToRelative(0.091f, -0.549f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, 0.517f, -0.608f)
                arcToRelative(7.52f, 7.52f, 0f, false, false, 0.478f, -0.198f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, 0.796f, 0.064f)
                lineToRelative(0.453f, 0.324f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 2.416f, -0.2f)
                lineToRelative(0.243f, -0.243f)
                curveToRelative(0.648f, -0.648f, 0.733f, -1.67f, 0.2f, -2.416f)
                lineToRelative(-0.324f, -0.453f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.064f, -0.796f)
                curveToRelative(0.071f, -0.157f, 0.137f, -0.316f, 0.198f, -0.478f)
                curveToRelative(0.1f, -0.267f, 0.327f, -0.47f, 0.608f, -0.517f)
                lineToRelative(0.55f, -0.091f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 1.566f, -1.85f)
                verticalLineToRelative(-0.344f)
                curveToRelative(0f, -0.916f, -0.663f, -1.699f, -1.567f, -1.85f)
                lineToRelative(-0.549f, -0.091f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.608f, -0.517f)
                arcToRelative(7.507f, 7.507f, 0f, false, false, -0.198f, -0.478f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, 0.064f, -0.796f)
                lineToRelative(0.324f, -0.453f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -0.2f, -2.416f)
                lineToRelative(-0.243f, -0.243f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -2.416f, -0.2f)
                lineToRelative(-0.453f, 0.324f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.796f, 0.064f)
                arcToRelative(7.462f, 7.462f, 0f, false, false, -0.478f, -0.198f)
                arcToRelative(0.798f, 0.798f, 0f, false, true, -0.517f, -0.608f)
                lineToRelative(-0.091f, -0.55f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -1.85f, -1.566f)
                horizontalLineToRelative(-0.344f)
                close()
                moveTo(12f, 15.75f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, -7.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 0f, 7.5f)
                close()
            }
        }.build()
        
        return _Cog8Tooth!!
    }

private var _Cog8Tooth: ImageVector? = null

