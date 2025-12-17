package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Scissors: ImageVector
    get() {
        if (_Scissors != null) return _Scissors!!
        
        _Scissors = ImageVector.Builder(
            name = "scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 6.665f)
                curveToRelative(0.969f, 0.56f, 2.157f, 0.396f, 2.94f, -0.323f)
                lineToRelative(0.359f, 0.207f)
                curveToRelative(0.34f, 0.196f, 0.777f, 0.02f, 0.97f, -0.322f)
                curveToRelative(0.19f, -0.337f, 0.115f, -0.784f, -0.22f, -0.977f)
                lineToRelative(-0.359f, -0.207f)
                arcToRelative(2.501f, 2.501f, 0f, true, false, -3.69f, 1.622f)
                close()
                moveTo(4.364f, 5f)
                arcToRelative(1f, 1f, 0f, true, true, -1.732f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.732f, 1f)
                close()
                moveTo(8.903f, 5.465f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -1.775f, 1.893f)
                lineToRelative(-0.375f, 1.398f)
                lineToRelative(-1.563f, 0.902f)
                arcToRelative(2.501f, 2.501f, 0f, true, false, 0.75f, 1.3f)
                lineTo(14.7f, 5.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.18f, -1.374f)
                lineToRelative(-0.782f, -0.21f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, -1.593f, 0.052f)
                lineTo(8.903f, 5.465f)
                close()
                moveTo(4.365f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, -1.732f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.732f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.892f, 10.408f)
                curveToRelative(-0.052f, 0.03f, -0.047f, 0.108f, 0.011f, 0.128f)
                lineToRelative(3.243f, 1.097f)
                arcToRelative(2.75f, 2.75f, 0f, false, false, 1.593f, 0.05f)
                lineToRelative(0.781f, -0.208f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.18f, -1.374f)
                lineToRelative(-2.137f, -1.235f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 0f)
                lineToRelative(-2.67f, 1.542f)
                close()
            }
        }.build()
        
        return _Scissors!!
    }

private var _Scissors: ImageVector? = null

