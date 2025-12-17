package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.AcademicCap: ImageVector
    get() {
        if (_AcademicCap != null) return _AcademicCap!!
        
        _AcademicCap = ImageVector.Builder(
            name = "academic-cap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.702f, 1.368f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.597f, 0f)
                curveToRelative(2.098f, 0.91f, 4.105f, 1.99f, 6.004f, 3.223f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.194f, 1.348f)
                arcTo(34.27f, 34.27f, 0f, false, false, 8.341f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.682f, 0f)
                curveToRelative(-0.625f, -0.32f, -1.262f, -0.62f, -1.909f, -0.901f)
                verticalLineToRelative(-0.542f)
                arcToRelative(36.878f, 36.878f, 0f, false, true, 2.568f, -1.33f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.636f, -1.357f)
                arcToRelative(38.39f, 38.39f, 0f, false, false, -3.06f, 1.605f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.372f, 0.648f)
                verticalLineToRelative(0.365f)
                curveToRelative(-0.773f, -0.294f, -1.56f, -0.56f, -2.359f, -0.8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.194f, -1.347f)
                arcToRelative(40.901f, 40.901f, 0f, false, true, 6.005f, -3.223f)
                close()
                moveTo(4.25f, 8.348f)
                curveToRelative(-0.53f, -0.212f, -1.067f, -0.411f, -1.611f, -0.596f)
                arcToRelative(40.973f, 40.973f, 0f, false, false, -0.418f, 2.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.474f, 0.776f)
                curveToRelative(0.175f, 0.068f, 0.35f, 0.138f, 0.524f, 0.21f)
                arcToRelative(5.544f, 5.544f, 0f, false, true, -0.58f, 0.681f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                curveToRelative(0.35f, -0.349f, 0.655f, -0.726f, 0.915f, -1.124f)
                arcToRelative(29.282f, 29.282f, 0f, false, false, -1.395f, -0.617f)
                arcTo(5.483f, 5.483f, 0f, false, false, 4.25f, 8.5f)
                verticalLineToRelative(-0.152f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.603f, 13.96f)
                curveToRelative(-0.96f, -0.6f, -1.958f, -1.147f, -2.989f, -1.635f)
                arcToRelative(6.981f, 6.981f, 0f, false, false, 1.12f, -3.341f)
                curveToRelative(0.419f, 0.192f, 0.834f, 0.393f, 1.244f, 0.602f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.045f, 0f)
                arcToRelative(32.787f, 32.787f, 0f, false, true, 4.338f, -1.834f)
                curveToRelative(0.175f, 0.978f, 0.315f, 1.969f, 0.419f, 2.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.474f, 0.776f)
                arcToRelative(29.385f, 29.385f, 0f, false, false, -4.909f, 2.461f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.794f, 0f)
                close()
            }
        }.build()
        
        return _AcademicCap!!
    }

private var _AcademicCap: ImageVector? = null

