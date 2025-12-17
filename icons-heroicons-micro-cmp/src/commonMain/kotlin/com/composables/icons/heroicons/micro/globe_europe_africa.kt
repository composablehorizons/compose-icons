package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.GlobeEuropeAfrica: ImageVector
    get() {
        if (_GlobeEuropeAfrica != null) return _GlobeEuropeAfrica!!
        
        _GlobeEuropeAfrica = ImageVector.Builder(
            name = "globe-europe-africa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                close()
                moveTo(5.657f, 3.023f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 7.584f, 3.304f)
                lineToRelative(-0.947f, -0.63f)
                arcToRelative(0.431f, 0.431f, 0f, false, false, -0.544f, 0.053f)
                arcToRelative(0.431f, 0.431f, 0f, false, true, -0.544f, 0.054f)
                lineToRelative(-0.467f, -0.312f)
                arcToRelative(0.475f, 0.475f, 0f, false, false, -0.689f, 0.608f)
                lineToRelative(0.226f, 0.453f)
                arcToRelative(2.119f, 2.119f, 0f, false, true, 0f, 1.894f)
                lineTo(10.1f, 8.8f)
                arcToRelative(0.947f, 0.947f, 0f, false, false, -0.1f, 0.424f)
                verticalLineToRelative(0.11f)
                arcToRelative(2f, 2f, 0f, false, true, -0.4f, 1.2f)
                lineTo(8.8f, 11.6f)
                arcTo(1f, 1f, 0f, false, true, 7f, 11f)
                verticalLineToRelative(-0.382f)
                arcToRelative(1f, 1f, 0f, false, false, -0.553f, -0.894f)
                lineToRelative(-0.422f, -0.212f)
                arcTo(1.854f, 1.854f, 0f, false, true, 6.855f, 6f)
                horizontalLineToRelative(0.707f)
                arcToRelative(0.438f, 0.438f, 0f, true, false, -0.107f, -0.864f)
                lineToRelative(-0.835f, 0.209f)
                arcToRelative(1.129f, 1.129f, 0f, false, true, -1.305f, -1.553f)
                lineToRelative(0.342f, -0.77f)
                close()
            }
        }.build()
        
        return _GlobeEuropeAfrica!!
    }

private var _GlobeEuropeAfrica: ImageVector? = null

