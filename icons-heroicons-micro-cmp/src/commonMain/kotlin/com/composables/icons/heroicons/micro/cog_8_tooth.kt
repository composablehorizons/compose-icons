package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cog8Tooth: ImageVector
    get() {
        if (_Cog8Tooth != null) return _Cog8Tooth!!
        
        _Cog8Tooth = ImageVector.Builder(
            name = "cog-8-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.955f, 1.45f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.452f, 1f)
                horizontalLineToRelative(1.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.497f, 0.45f)
                lineToRelative(0.17f, 1.699f)
                curveToRelative(0.484f, 0.12f, 0.94f, 0.312f, 1.356f, 0.562f)
                lineToRelative(1.321f, -1.081f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.67f, 0.033f)
                lineToRelative(0.774f, 0.775f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.034f, 0.67f)
                lineToRelative(-1.08f, 1.32f)
                curveToRelative(0.25f, 0.417f, 0.44f, 0.873f, 0.561f, 1.357f)
                lineToRelative(1.699f, 0.17f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.45f, 0.497f)
                verticalLineToRelative(1.096f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.45f, 0.497f)
                lineToRelative(-1.699f, 0.17f)
                curveToRelative(-0.12f, 0.484f, -0.312f, 0.94f, -0.562f, 1.356f)
                lineToRelative(1.082f, 1.322f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.034f, 0.67f)
                lineToRelative(-0.774f, 0.774f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.67f, 0.033f)
                lineToRelative(-1.322f, -1.08f)
                curveToRelative(-0.416f, 0.25f, -0.872f, 0.44f, -1.356f, 0.561f)
                lineToRelative(-0.17f, 1.699f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.497f, 0.45f)
                horizontalLineTo(7.452f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.497f, -0.45f)
                lineToRelative(-0.17f, -1.699f)
                arcToRelative(4.973f, 4.973f, 0f, false, true, -1.356f, -0.562f)
                lineTo(4.108f, 13.37f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.67f, -0.033f)
                lineToRelative(-0.774f, -0.775f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.034f, -0.67f)
                lineToRelative(1.08f, -1.32f)
                arcToRelative(4.971f, 4.971f, 0f, false, true, -0.561f, -1.357f)
                lineToRelative(-1.699f, -0.17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 8.548f)
                verticalLineTo(7.452f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.45f, -0.497f)
                lineToRelative(1.699f, -0.17f)
                curveToRelative(0.12f, -0.484f, 0.312f, -0.94f, 0.562f, -1.356f)
                lineTo(2.629f, 4.107f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.034f, -0.67f)
                lineToRelative(0.774f, -0.774f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.67f, -0.033f)
                lineTo(5.43f, 3.71f)
                arcToRelative(4.97f, 4.97f, 0f, false, true, 1.356f, -0.561f)
                lineToRelative(0.17f, -1.699f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0f, 0.538f, 0.212f, 1.026f, 0.558f, 1.385f)
                lineToRelative(0.057f, 0.057f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, -2.828f)
                lineToRelative(-0.058f, -0.056f)
                arcTo(2f, 2f, 0f, false, false, 6f, 8f)
                close()
            }
        }.build()
        
        return _Cog8Tooth!!
    }

private var _Cog8Tooth: ImageVector? = null

