package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cog6Tooth: ImageVector
    get() {
        if (_Cog6Tooth != null) return _Cog6Tooth!!
        
        _Cog6Tooth = ImageVector.Builder(
            name = "cog-6-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.84f, 1.804f)
                arcTo(1f, 1f, 0f, false, true, 8.82f, 1f)
                horizontalLineToRelative(2.36f)
                arcToRelative(1f, 1f, 0f, false, true, 0.98f, 0.804f)
                lineToRelative(0.331f, 1.652f)
                arcToRelative(6.993f, 6.993f, 0f, false, true, 1.929f, 1.115f)
                lineToRelative(1.598f, -0.54f)
                arcToRelative(1f, 1f, 0f, false, true, 1.186f, 0.447f)
                lineToRelative(1.18f, 2.044f)
                arcToRelative(1f, 1f, 0f, false, true, -0.205f, 1.251f)
                lineToRelative(-1.267f, 1.113f)
                arcToRelative(7.047f, 7.047f, 0f, false, true, 0f, 2.228f)
                lineToRelative(1.267f, 1.113f)
                arcToRelative(1f, 1f, 0f, false, true, 0.206f, 1.25f)
                lineToRelative(-1.18f, 2.045f)
                arcToRelative(1f, 1f, 0f, false, true, -1.187f, 0.447f)
                lineToRelative(-1.598f, -0.54f)
                arcToRelative(6.993f, 6.993f, 0f, false, true, -1.929f, 1.115f)
                lineToRelative(-0.33f, 1.652f)
                arcToRelative(1f, 1f, 0f, false, true, -0.98f, 0.804f)
                horizontalLineTo(8.82f)
                arcToRelative(1f, 1f, 0f, false, true, -0.98f, -0.804f)
                lineToRelative(-0.331f, -1.652f)
                arcToRelative(6.993f, 6.993f, 0f, false, true, -1.929f, -1.115f)
                lineToRelative(-1.598f, 0.54f)
                arcToRelative(1f, 1f, 0f, false, true, -1.186f, -0.447f)
                lineToRelative(-1.18f, -2.044f)
                arcToRelative(1f, 1f, 0f, false, true, 0.205f, -1.251f)
                lineToRelative(1.267f, -1.114f)
                arcToRelative(7.05f, 7.05f, 0f, false, true, 0f, -2.227f)
                lineTo(1.821f, 7.773f)
                arcToRelative(1f, 1f, 0f, false, true, -0.206f, -1.25f)
                lineToRelative(1.18f, -2.045f)
                arcToRelative(1f, 1f, 0f, false, true, 1.187f, -0.447f)
                lineToRelative(1.598f, 0.54f)
                arcTo(6.992f, 6.992f, 0f, false, true, 7.51f, 3.456f)
                lineToRelative(0.33f, -1.652f)
                close()
                moveTo(10f, 13f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
        }.build()
        
        return _Cog6Tooth!!
    }

private var _Cog6Tooth: ImageVector? = null

