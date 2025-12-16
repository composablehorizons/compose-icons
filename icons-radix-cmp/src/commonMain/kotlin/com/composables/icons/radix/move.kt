package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Move: ImageVector
    get() {
        if (_Move != null) return _Move!!
        
        _Move = ImageVector.Builder(
            name = "move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50016f, 9.0002f)
                curveTo(7.77622f, 9.00031f, 8.00016f, 9.22413f, 8.00016f, 9.5002f)
                verticalLineTo(12.6135f)
                lineTo(8.9318f, 11.6818f)
                curveTo(9.10754f, 11.5061f, 9.39279f, 11.5061f, 9.56852f, 11.6818f)
                curveTo(9.74406f, 11.8576f, 9.74419f, 12.1429f, 9.56852f, 12.3186f)
                lineTo(7.81852f, 14.0686f)
                curveTo(7.66475f, 14.2223f, 7.42679f, 14.2415f, 7.25212f, 14.1262f)
                lineTo(7.18181f, 14.0686f)
                lineTo(5.43181f, 12.3186f)
                lineTo(5.37419f, 12.2483f)
                curveTo(5.25867f, 12.0736f, 5.27796f, 11.8357f, 5.43181f, 11.6818f)
                curveTo(5.58565f, 11.528f, 5.82352f, 11.5087f, 5.99821f, 11.6242f)
                lineTo(6.06852f, 11.6818f)
                lineTo(7.00016f, 12.6135f)
                verticalLineTo(9.5002f)
                curveTo(7.00016f, 9.22406f, 7.22402f, 9.0002f, 7.50016f, 9.0002f)
                close()
                moveTo(11.6818f, 5.43185f)
                curveTo(11.8356f, 5.278f, 12.0735f, 5.25871f, 12.2482f, 5.37423f)
                lineTo(12.3185f, 5.43185f)
                lineTo(14.0685f, 7.18185f)
                lineTo(14.1261f, 7.25216f)
                curveTo(14.2415f, 7.42683f, 14.2223f, 7.66479f, 14.0685f, 7.81856f)
                lineTo(12.3185f, 9.56856f)
                curveTo(12.1429f, 9.74424f, 11.8576f, 9.7441f, 11.6818f, 9.56856f)
                curveTo(11.5061f, 9.39283f, 11.5061f, 9.10758f, 11.6818f, 8.93184f)
                lineTo(12.6134f, 8.0002f)
                horizontalLineTo(9.50016f)
                curveTo(9.22409f, 8.0002f, 9.00027f, 7.77626f, 9.00016f, 7.5002f)
                curveTo(9.00016f, 7.22406f, 9.22402f, 7.0002f, 9.50016f, 7.0002f)
                horizontalLineTo(12.6134f)
                lineTo(11.6818f, 6.06856f)
                lineTo(11.6242f, 5.99825f)
                curveTo(11.5087f, 5.82356f, 11.528f, 5.58569f, 11.6818f, 5.43185f)
                close()
                moveTo(2.6818f, 5.43185f)
                curveTo(2.85754f, 5.25611f, 3.14279f, 5.25611f, 3.31852f, 5.43185f)
                curveTo(3.49406f, 5.6076f, 3.49419f, 5.89289f, 3.31852f, 6.06856f)
                lineTo(2.38688f, 7.0002f)
                horizontalLineTo(5.50016f)
                lineTo(5.60075f, 7.00997f)
                curveTo(5.8286f, 7.05658f, 6.00016f, 7.25857f, 6.00016f, 7.5002f)
                curveTo(6.00007f, 7.74178f, 5.82858f, 7.94387f, 5.60075f, 7.99044f)
                lineTo(5.50016f, 8.0002f)
                horizontalLineTo(2.38688f)
                lineTo(3.31852f, 8.93184f)
                lineTo(3.37614f, 9.00216f)
                curveTo(3.49149f, 9.17683f, 3.4723f, 9.41479f, 3.31852f, 9.56856f)
                curveTo(3.16475f, 9.72234f, 2.92679f, 9.74153f, 2.75212f, 9.62618f)
                lineTo(2.6818f, 9.56856f)
                lineTo(0.931805f, 7.81856f)
                curveTo(0.756069f, 7.64283f, 0.756069f, 7.35758f, 0.931805f, 7.18185f)
                lineTo(2.6818f, 5.43185f)
                close()
                moveTo(7.25212f, 0.874228f)
                curveTo(7.42681f, 0.758749f, 7.66469f, 0.778015f, 7.81852f, 0.931845f)
                lineTo(9.56852f, 2.68185f)
                lineTo(9.62614f, 2.75216f)
                curveTo(9.74149f, 2.92683f, 9.7223f, 3.16479f, 9.56852f, 3.31856f)
                curveTo(9.41475f, 3.47234f, 9.17679f, 3.49153f, 9.00212f, 3.37618f)
                lineTo(8.9318f, 3.31856f)
                lineTo(8.00016f, 2.38692f)
                verticalLineTo(5.5002f)
                lineTo(7.9904f, 5.60079f)
                curveTo(7.94383f, 5.82862f, 7.74174f, 6.00011f, 7.50016f, 6.0002f)
                curveTo(7.25853f, 6.0002f, 7.05654f, 5.82864f, 7.00993f, 5.60079f)
                lineTo(7.00016f, 5.5002f)
                verticalLineTo(2.38692f)
                lineTo(6.06852f, 3.31856f)
                curveTo(5.89285f, 3.49423f, 5.60756f, 3.4941f, 5.43181f, 3.31856f)
                curveTo(5.25607f, 3.14283f, 5.25607f, 2.85758f, 5.43181f, 2.68185f)
                lineTo(7.18181f, 0.931845f)
                lineTo(7.25212f, 0.874228f)
                close()
            }
        }.build()
        
        return _Move!!
    }

private var _Move: ImageVector? = null

