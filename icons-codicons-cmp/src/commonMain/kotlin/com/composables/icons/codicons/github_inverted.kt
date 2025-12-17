package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GithubInverted: ImageVector
    get() {
        if (_GithubInverted != null) return _GithubInverted!!
        
        _GithubInverted = ImageVector.Builder(
            name = "github-inverted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.97553f, 0f)
                curveTo(3.57186f, 0f, 0f, 3.57186f, 0f, 7.97553f)
                curveTo(0f, 11.4985f, 2.29969f, 14.4832f, 5.43119f, 15.5596f)
                curveTo(5.82263f, 15.6086f, 5.96942f, 15.3639f, 5.96942f, 15.1682f)
                curveTo(5.96942f, 14.9725f, 5.96942f, 14.4832f, 5.96942f, 13.7982f)
                curveTo(3.76758f, 14.2875f, 3.27829f, 12.7217f, 3.27829f, 12.7217f)
                curveTo(2.93578f, 11.792f, 2.39755f, 11.5474f, 2.39755f, 11.5474f)
                curveTo(1.66361f, 11.0581f, 2.44648f, 11.0581f, 2.44648f, 11.0581f)
                curveTo(3.22936f, 11.107f, 3.66972f, 11.8899f, 3.66972f, 11.8899f)
                curveTo(4.40367f, 13.1131f, 5.52905f, 12.7706f, 5.96942f, 12.5749f)
                curveTo(6.01835f, 12.0367f, 6.263f, 11.6942f, 6.45872f, 11.4985f)
                curveTo(4.69725f, 11.3028f, 2.83792f, 10.6177f, 2.83792f, 7.53517f)
                curveTo(2.83792f, 6.65443f, 3.1315f, 5.96942f, 3.66972f, 5.38226f)
                curveTo(3.6208f, 5.23547f, 3.32722f, 4.40367f, 3.76758f, 3.32722f)
                curveTo(3.76758f, 3.32722f, 4.4526f, 3.1315f, 5.96942f, 4.15902f)
                curveTo(6.6055f, 3.9633f, 7.29052f, 3.91437f, 7.97553f, 3.91437f)
                curveTo(8.66055f, 3.91437f, 9.34556f, 4.01223f, 9.98165f, 4.15902f)
                curveTo(11.4985f, 3.1315f, 12.1835f, 3.32722f, 12.1835f, 3.32722f)
                curveTo(12.6239f, 4.40367f, 12.3303f, 5.23547f, 12.2813f, 5.43119f)
                curveTo(12.7706f, 5.96942f, 13.1131f, 6.70336f, 13.1131f, 7.5841f)
                curveTo(13.1131f, 10.6667f, 11.2538f, 11.3028f, 9.49235f, 11.4985f)
                curveTo(9.78593f, 11.7431f, 10.0306f, 12.2324f, 10.0306f, 12.9664f)
                curveTo(10.0306f, 14.0428f, 10.0306f, 14.8746f, 10.0306f, 15.1682f)
                curveTo(10.0306f, 15.3639f, 10.1774f, 15.6086f, 10.5688f, 15.5596f)
                curveTo(13.7492f, 14.4832f, 16f, 11.4985f, 16f, 7.97553f)
                curveTo(15.9511f, 3.57186f, 12.3792f, 0f, 7.97553f, 0f)
                close()
            }
        }.build()
        
        return _GithubInverted!!
    }

private var _GithubInverted: ImageVector? = null

