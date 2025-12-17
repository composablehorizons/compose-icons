package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cog8Tooth: ImageVector
    get() {
        if (_Cog8Tooth != null) return _Cog8Tooth!!
        
        _Cog8Tooth = ImageVector.Builder(
            name = "cog-8-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.34f, 1.804f)
                arcTo(1f, 1f, 0f, false, true, 9.32f, 1f)
                horizontalLineToRelative(1.36f)
                arcToRelative(1f, 1f, 0f, false, true, 0.98f, 0.804f)
                lineToRelative(0.295f, 1.473f)
                curveToRelative(0.497f, 0.144f, 0.971f, 0.342f, 1.416f, 0.587f)
                lineToRelative(1.25f, -0.834f)
                arcToRelative(1f, 1f, 0f, false, true, 1.262f, 0.125f)
                lineToRelative(0.962f, 0.962f)
                arcToRelative(1f, 1f, 0f, false, true, 0.125f, 1.262f)
                lineToRelative(-0.834f, 1.25f)
                curveToRelative(0.245f, 0.445f, 0.443f, 0.919f, 0.587f, 1.416f)
                lineToRelative(1.473f, 0.294f)
                arcToRelative(1f, 1f, 0f, false, true, 0.804f, 0.98f)
                verticalLineToRelative(1.361f)
                arcToRelative(1f, 1f, 0f, false, true, -0.804f, 0.98f)
                lineToRelative(-1.473f, 0.295f)
                arcToRelative(6.95f, 6.95f, 0f, false, true, -0.587f, 1.416f)
                lineToRelative(0.834f, 1.25f)
                arcToRelative(1f, 1f, 0f, false, true, -0.125f, 1.262f)
                lineToRelative(-0.962f, 0.962f)
                arcToRelative(1f, 1f, 0f, false, true, -1.262f, 0.125f)
                lineToRelative(-1.25f, -0.834f)
                arcToRelative(6.953f, 6.953f, 0f, false, true, -1.416f, 0.587f)
                lineToRelative(-0.294f, 1.473f)
                arcToRelative(1f, 1f, 0f, false, true, -0.98f, 0.804f)
                horizontalLineTo(9.32f)
                arcToRelative(1f, 1f, 0f, false, true, -0.98f, -0.804f)
                lineToRelative(-0.295f, -1.473f)
                arcToRelative(6.957f, 6.957f, 0f, false, true, -1.416f, -0.587f)
                lineToRelative(-1.25f, 0.834f)
                arcToRelative(1f, 1f, 0f, false, true, -1.262f, -0.125f)
                lineToRelative(-0.962f, -0.962f)
                arcToRelative(1f, 1f, 0f, false, true, -0.125f, -1.262f)
                lineToRelative(0.834f, -1.25f)
                arcToRelative(6.957f, 6.957f, 0f, false, true, -0.587f, -1.416f)
                lineToRelative(-1.473f, -0.294f)
                arcTo(1f, 1f, 0f, false, true, 1f, 10.68f)
                verticalLineTo(9.32f)
                arcToRelative(1f, 1f, 0f, false, true, 0.804f, -0.98f)
                lineToRelative(1.473f, -0.295f)
                curveToRelative(0.144f, -0.497f, 0.342f, -0.971f, 0.587f, -1.416f)
                lineToRelative(-0.834f, -1.25f)
                arcToRelative(1f, 1f, 0f, false, true, 0.125f, -1.262f)
                lineToRelative(0.962f, -0.962f)
                arcTo(1f, 1f, 0f, false, true, 5.38f, 3.03f)
                lineToRelative(1.25f, 0.834f)
                arcToRelative(6.957f, 6.957f, 0f, false, true, 1.416f, -0.587f)
                lineToRelative(0.294f, -1.473f)
                close()
                moveTo(13f, 10f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _Cog8Tooth!!
    }

private var _Cog8Tooth: ImageVector? = null

