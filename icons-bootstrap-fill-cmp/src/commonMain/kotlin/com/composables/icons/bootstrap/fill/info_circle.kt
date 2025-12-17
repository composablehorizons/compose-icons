package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.InfoCircle: ImageVector
    get() {
        if (_InfoCircle != null) return _InfoCircle!!
        
        _InfoCircle = ImageVector.Builder(
            name = "info-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(0.93f, -9.412f)
                lineToRelative(-1f, 4.705f)
                curveToRelative(-0.07f, 0.34f, 0.029f, 0.533f, 0.304f, 0.533f)
                curveToRelative(0.194f, 0f, 0.487f, -0.07f, 0.686f, -0.246f)
                lineToRelative(-0.088f, 0.416f)
                curveToRelative(-0.287f, 0.346f, -0.92f, 0.598f, -1.465f, 0.598f)
                curveToRelative(-0.703f, 0f, -1.002f, -0.422f, -0.808f, -1.319f)
                lineToRelative(0.738f, -3.468f)
                curveToRelative(0.064f, -0.293f, 0.006f, -0.399f, -0.287f, -0.47f)
                lineToRelative(-0.451f, -0.081f)
                lineToRelative(0.082f, -0.381f)
                lineToRelative(2.29f, -0.287f)
                close()
                moveTo(8f, 5.5f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _InfoCircle!!
    }

private var _InfoCircle: ImageVector? = null

