package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleLetterM: ImageVector
    get() {
        if (_CircleLetterM != null) return _CircleLetterM!!
        
        _CircleLetterM = ImageVector.Builder(
            name = "circle-letter-m",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
                reflectiveCurveToRelative(-10f, -4.477f, -10f, -10f)
                reflectiveCurveToRelative(4.477f, -10f, 10f, -10f)
                moveToRelative(4f, 6f)
                curveToRelative(0f, -1.014f, -1.336f, -1.384f, -1.857f, -0.514f)
                lineToRelative(-2.143f, 3.57f)
                lineToRelative(-2.143f, -3.57f)
                curveToRelative(-0.521f, -0.87f, -1.857f, -0.5f, -1.857f, 0.514f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-4.39f)
                lineToRelative(1.143f, 1.904f)
                lineToRelative(0.074f, 0.108f)
                arcToRelative(1f, 1f, 0f, false, false, 1.64f, -0.108f)
                lineToRelative(1.143f, -1.904f)
                verticalLineToRelative(4.39f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                close()
            }
        }.build()
        
        return _CircleLetterM!!
    }

private var _CircleLetterM: ImageVector? = null

